package io.anygogin31.vi.usecase

public fun interface UseCaseWith<in I : Any, out O : Any> : suspend (I) -> Result<O>
