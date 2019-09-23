package com.lyf.service.dao;

import com.lyf.service.pojo.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface CityDao extends JpaRepository<City,String>,JpaSpecificationExecutor<City> {
    //public City findByMobile(String mobile);

    @Modifying
    @Query(value = "update tb_user set fanscount=fanscount+? where id=?", nativeQuery = true)
    public void updatefanscount(int x, String friendid);

    @Modifying
    @Query(value = "update tb_user set followcount=followcount+? where id=?", nativeQuery = true)
    public void updatefollowcount(int x, String userid);
}
