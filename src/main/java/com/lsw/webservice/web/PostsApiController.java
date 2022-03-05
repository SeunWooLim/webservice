package com.lsw.webservice.web;

import com.lsw.webservice.service.posts.PostsService;
import com.lsw.webservice.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

}
