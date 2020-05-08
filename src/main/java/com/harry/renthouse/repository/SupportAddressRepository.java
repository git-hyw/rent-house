package com.harry.renthouse.repository;

import com.harry.renthouse.entity.SupportAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *  支持的地区dao
 * @author Harry Xu
 * @date 2020/5/8 17:04
 */
@Repository
public interface SupportAddressRepository  extends JpaRepository<SupportAddress, Long> {

    /**
     * 查询所有对应行政级别的信息
     * @param level 行政级别
     * @return 行政级别列表
     */
    List<SupportAddress> findAllByLevel(String level);
}
