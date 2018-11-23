package com.zhaolearn.bilateral.repository;


import com.zhaolearn.bilateral.domain.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ScoreRepository extends JpaRepository<Score, Long> , JpaSpecificationExecutor< Score>  {
}
