package com.mageddo.commons.jdbc;

import com.mageddo.tobby.internal.utils.Validator;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DBUtils {

  private static final Pattern DB_NAME_REGEX = Pattern.compile("jdbc:(\\w+):");

  private DBUtils() {
  }

  public static DB discoverDB(String url) {
    return DB.of(findDBName(url));
  }

  public static DB discoverDB(Connection connection) {
    try {
      final String url = connection
          .getMetaData()
          .getURL();
      return discoverDB(url);
    } catch (SQLException e) {
      throw new UncheckedSQLException(e);
    }
  }

  public static DB discoverDB(DataSource dataSource) {
    try (Connection con = dataSource.getConnection()) {
      return DBUtils.discoverDB(con);
    } catch (SQLException e) {
      throw new UncheckedSQLException(e);
    }
  }

  public static String findDBName(String jdbcUrl) {
    final Matcher matcher = DB_NAME_REGEX.matcher(jdbcUrl);
    Validator.isTrue(matcher.find(), "Couldn't parse jdbc url: %s", jdbcUrl);
    return matcher.group(1);
  }

}
