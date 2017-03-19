package org.ril.madera.controller;

import org.ril.madera.model.City;
import org.ril.madera.service.CalcParamterServices;
import org.ril.madera.service.CityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Gamer on 19/03/2017.
 */

@Controller
public class CityController {
    @Autowired
    private CityServices cityServices;
}
