package com.auth.auth.services.Train.DriverAssitances;

import com.auth.auth.services.Train.DriverAssistanceSystemsService;
import com.auth.auth.services.Train.IDriverAssistanceSystemsService;

public class IC extends DriverAssistanceSystemsService implements IDriverAssistanceSystemsService {
    @Override
    public String getAssistance() {
        return "Assistance for"+ this.getClass().getSimpleName();
    }
}
