package com.sacavix.tech.mapper;

public interface IMapper<I,O> {
    public O map(I in);
}
