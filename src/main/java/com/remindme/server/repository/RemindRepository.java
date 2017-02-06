package com.remindme.server.repository;

import com.remindme.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vv_voronov on 27.01.2017.
 */
public interface RemindRepository extends JpaRepository<Remind,Long> {
}
