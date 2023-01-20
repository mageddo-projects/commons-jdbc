package com.mageddo.commons.jdbc;

import java.sql.SQLException;

public class QueryTimeoutException extends UncheckedSQLException {

  public QueryTimeoutException(SQLException e) {
    super(e);
  }

  public QueryTimeoutException(String msg, SQLException e) {
    super(msg, e);
  }

  public static RuntimeException check(DB db, SQLException e) {
    if (SqlErrorCodes.isQueryTimeoutError(db, e)) {
      throw new QueryTimeoutException(e);
    }
    throw new UncheckedSQLException(e);
  }
}
