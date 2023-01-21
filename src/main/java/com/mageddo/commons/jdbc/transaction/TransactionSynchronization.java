package com.mageddo.commons.jdbc.transaction;

public interface TransactionSynchronization {
  /**
   * Execute this callback after commit the database transaction.
   *
   * @see TransactionSynchronizationManager
   */
  void afterCommit();
}
