package net.gocoder.restapi.info.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoCoder {
    public String homepage;
    public String brunch;
    public String job;
    public String[] books;    
}
