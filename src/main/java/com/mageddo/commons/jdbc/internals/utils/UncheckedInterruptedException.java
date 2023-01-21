package com.mageddo.commons.jdbc.internals.utils;

public class UncheckedInterruptedException extends RuntimeException {

  private final InterruptedException interruptedException;

  public UncheckedInterruptedException(InterruptedException interruptedException) {
    super(interruptedException);
    this.interruptedException = interruptedException;
  }

  public InterruptedException getInterruptedException() {
    return interruptedException;
  }
}
