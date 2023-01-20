package com.mageddo.commons.jdbc.internals.utils;

import java.util.concurrent.ExecutionException;

public class UncheckedExecutionException extends RuntimeException {

  private final ExecutionException executionException;

  public UncheckedExecutionException(ExecutionException executionException) {
    super(executionException);
    this.executionException = executionException;
  }

  public ExecutionException getExecutionException() {
    return executionException;
  }
}
