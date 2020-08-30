package com.stock.tradeDetails.dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.stock.portlet.model.TradeInfo;

public class TradeDao {
	public List<TradeInfo> getTradeDetails() {
		String query = "select * from oi_table";
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<TradeInfo> tradeInfo = new ArrayList<TradeInfo>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?useSSL=false", "root",
					"");
			stmt = connection.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				TradeInfo tradeDetails = new TradeInfo();
				tradeDetails.setDayHigh(rs.getString("DayHigh"));
				tradeDetails.setDayLow(rs.getString("DayLow"));
				tradeDetails.setLevelBreak(rs.getString("Breakout"));
				tradeDetails.setLtp(rs.getString("LTP"));
				tradeDetails.setLtpChange(rs.getString("LTPChange"));
				tradeDetails.setOi(rs.getString("OI"));
				tradeDetails.setOiChange(rs.getString("OIChange"));
				tradeDetails.setOiInterpretation(rs.getString("OI_Interpret"));
				tradeDetails.setDate(rs.getString("Date"));
				tradeInfo.add(tradeDetails);

			}
			rs.close();
			stmt.close();
			connection.close();

		} catch (Exception e) {
			System.out.println("Error in getTradeDetails 3306" + e);
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (connection != null) {
					connection.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (Exception e) {
				System.out.println("Error in Finally block getTradeDetails" + e.getMessage());

			}
		}

		return tradeInfo;
	}

}
