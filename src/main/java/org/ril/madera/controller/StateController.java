package org.ril.madera.controller;

import org.ril.madera.service.StateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Gamer on 19/03/2017.
 */

@Controller
public class StateController {


    @Autowired
    private StateServices stateServices;
}
