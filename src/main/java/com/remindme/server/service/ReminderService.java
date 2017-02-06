package com.remindme.server.service;

import com.remindme.server.entity.Remind;

import java.util.List;

/**
 * Created by vv_voronov on 27.01.2017.
 */

public interface ReminderService {


    void remove(long id);

    Remind save(Remind remind);

    Remind getByID(long remindID);

    List<Remind> getAll();
}
