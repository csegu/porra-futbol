package com.github.csegu.porrafutbol.service;

import com.github.csegu.porrafutbol.dto.ResultDto;
import com.github.csegu.porrafutbol.model.Result;
import com.github.csegu.porrafutbol.repository.ResultRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class ResultService {
    private ResultRepository resultRepository;


    @Transactional
    public void addResult(ResultDto resultDto) {
        Result result = new Result(resultDto.getResultId(), resultDto.getGoalsTeam1(), resultDto.getGoalsTeam2(),resultDto.getResult());
        resultRepository.save(result);
    }

    public List<ResultDto> listResults() {
        return resultRepository.findAll().stream().map(ResultService::map).collect(Collectors.toList());
    }

    public ResultDto findById(Long id) {
        return ResultService.map(resultRepository.getOne(id));
    }

    public static ResultDto map(Result result) {
        ResultDto resultdto = null;
        if (result != null) {
            resultdto = new ResultDto(result.getResultId(), result.getGoalsTeam1(), result.getGoalsTeam2(), result.getResult());
        }
        return resultdto;
    }
}