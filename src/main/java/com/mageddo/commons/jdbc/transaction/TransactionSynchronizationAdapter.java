package com.mageddo.commons.jdbc.transaction;

public abstract class TransactionSynchronizationAdapter implements TransactionSynchronization {
  @Override
  public void afterCommit(){
  }
}
