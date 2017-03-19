package org.ril.madera.controller;

import org.ril.madera.model.Component;
import org.ril.madera.service.ComponentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Gamer on 19/03/2017.
 */

@Controller
public class componentController {
    @Autowired
    private ComponentServices componentServices;
}
