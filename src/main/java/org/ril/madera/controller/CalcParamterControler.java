package org.ril.madera.controller;

import org.ril.madera.service.CalcParamterServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Gamer on 19/03/2017.
 */

@Controller
public class CalcParamterControler {

    @Autowired
    private CalcParamterServices calcParamterServices;
}