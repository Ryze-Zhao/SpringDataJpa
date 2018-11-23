package com.zhaolearn.manytoone.repository;

import com.zhaolearn.manytoone.domain.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ScoreRepository extends JpaRepository<Score, Long> , JpaSpecificationExecutor< Score>  {
}
