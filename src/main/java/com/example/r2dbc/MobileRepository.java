package com.example.r2dbc;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileRepository  extends ReactiveCrudRepository<Mobile, Long> {
}
