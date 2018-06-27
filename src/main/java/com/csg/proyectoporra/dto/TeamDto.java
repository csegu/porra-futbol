package com.csg.proyectoporra.dto;

/**
 *
 * @author Cristian Segura <jordison@gmail.com>
 */
public class TeamDto {
    
    private Long id;
    private String name;

    public TeamDto() {
    }

    public TeamDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Team{" + "id=" + id + ", name=" + name + '}';
    }
    
}
