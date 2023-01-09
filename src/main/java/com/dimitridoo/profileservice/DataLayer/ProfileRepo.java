package com.dimitridoo.profileservice.DataLayer;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ProfileRepo extends ReactiveMongoRepository<Profile, String> {

    public Mono<Profile> findProfileByUserId(String userId);
    public Mono<Profile> findProfileByUsername(String username);
    public Mono<Profile> findProfileByEmail(String email);

    public Mono<Profile> deleteProfileByUsernameAndUserId(String username, String userId);


}
