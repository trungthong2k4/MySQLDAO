package thong.dev.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import thong.dev.data.driver.MySQLDriver;
import thong.dev.data.model.Order;
import thongdev.data.dao.OrderDao;

import java.util.logging.Level;

public class OederImpl implements OrderDao {
	
	Connection con = MySQLDriver.getInstance().getConnection();
	
}
