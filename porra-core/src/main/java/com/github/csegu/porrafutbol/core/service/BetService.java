package com.github.csegu.porrafutbol.core.service;

import com.github.csegu.porrafutbol.core.dto.BetDto;
import com.github.csegu.porrafutbol.core.model.Bet;
import com.github.csegu.porrafutbol.core.repository.BetRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@AllArgsConstructor(onConstructor = @__({
    @Autowired}))
public class BetService {

    private BetRepository betRepository;

    @Transactional
    public void addBet(BetDto betDto) {
        Bet bet = new Bet(betDto.getBetId(), betDto.getMatch(), betDto.getResult(), betDto.getPoints());
        betRepository.save(bet);
    }

    public List<BetDto> listBets() {
        return betRepository.findAll().stream().map(BetService::map).collect(Collectors.toList());
    }

    public BetDto findById(Long id) {
        return BetService.map(betRepository.getOne(id));
    }

    public static BetDto map(Bet bet) {
        BetDto result = null;
        if (bet != null) {
            result = new BetDto(bet.getBetId(), bet.getMatch(), bet.getResult(), bet.getPoints());
        }
        return result;
    }
    
}
