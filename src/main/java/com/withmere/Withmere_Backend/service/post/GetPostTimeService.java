package com.withmere.Withmere_Backend.service.post;

import com.withmere.Withmere_Backend.dto.Post.PostResponse;
import com.withmere.Withmere_Backend.exception.UserNotFoundException;
import com.withmere.Withmere_Backend.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
/*
@RequiredArgsConstructor
@Service
public class GetPostTimeService {
    private final PostRepository postRepository;
    @Transactional
    public List<PostResponse> execute(LocalDate startDate, LocalDate endDate) {

        List<PostResponse> follows = postRepository.findByStartDateAndEndDate(startDate, endDate)
                .stream()
                .map(PostResponse::new)
                .collect(Collectors.toList());

        return follows;
    }
}
*/
