package com.remindme.server.service;

import com.remindme.server.entity.Remind;
import com.remindme.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vv_voronov on 27.01.2017.
 */
@Service
public class ReminderServiceImpl implements ReminderService {

    @Autowired
    private RemindRepository repository;
    @Override
    public void remove(long id) {
        repository.delete(id);
    }

    @Override
    public Remind save(Remind remind) {
        return repository.saveAndFlush(remind);
    }

    @Override
    public Remind getByID(long remindID) {
        return repository.findOne(remindID);
    }

    @Override
    public List<Remind> getAll() {
        return repository.findAll();
    }
}
