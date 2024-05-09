package com.example.laby.repository;

import com.example.laby.entity.CommentEntity;
import com.example.laby.entity.HeartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
    List<CommentEntity> findByPostId(Long postId);

    List<CommentEntity> findByMemberId(Long memberId);

    void deleteById(Long id);

}
