package com.kashif.common.domain.usecase

import com.kashif.common.data.repository.AbstractRepository

class GetTopRatedMoviesPagingSource(private val repository: AbstractRepository) {
    operator fun invoke() = repository.getTopRatedMoviesPagingSource()
}