package com.library.management.system.dao;

public interface BookDao {
	public int save(int bookId, String bookName, String author, String category, Float price, int quantity) ;

	/*	int status = 0;
		try {
			Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"insert into books(id,name,author,category,publisher,quantity) values(?,?,?,?,?,?)");

			ps.setInt(1, bookId);
			ps.setString(2, bookName);
			ps.setString(3, author);
			ps.setString(4, category);
			ps.setFloat(5, price);
			ps.setInt(5, quantity);
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}*/

}

