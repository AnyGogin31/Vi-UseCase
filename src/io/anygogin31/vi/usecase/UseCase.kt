package io.anygogin31.vi.usecase

public fun interface UseCase<out O : Any> : suspend () -> Result<O>
