package com.ninja_squad.geektic.service;
/**
 * Created by p0905121 on 24/06/2015.
 */
import com.ninja_squad.geektic.Geek;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import javax.transaction.Transactional;
import com.ninja_squad.geektic.DAO.*;
import java.util.*;
import static org.springframework.web.bind.annotation.RequestMethod.*;


@RestController
@Transactional
public class GeekticService {

    @Autowired
    GeekticDAO geekticservice;

    @RequestMapping(value = "/list", method = GET)
    public List<Geek> viewGeek() {
        return geekticservice.displayGeek();
    }


}
