package com.facebookApi.facebookApi.repository;

import com.facebookApi.facebookApi.models.Story;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StoryRepository extends JpaRepository<Story, Long> {
//    Optional<Story> findBy
}
