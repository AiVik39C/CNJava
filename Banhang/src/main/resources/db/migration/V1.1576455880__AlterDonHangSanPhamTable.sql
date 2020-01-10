drop table don_hang;
drop table don_hang_san_pham;
drop table san_pham;

create table DonHang
(
	id_DonHang int AUTO_INCREMENT primary key,
	id_TaiKhoan int not null,
	tongSoLuong int not null,
	id_SanPham int not null,
	tongTien float not null,
	ngayMua date not null,
	tinhTrangDH varchar(100) not null

)

create table SanPham
(
	id_SanPham int AUTO_INCREMENT primary key,
	tenSanPham varchar(100) not null,
	giaDaGiam float not null,
	giaBan float not null,
	id_NCC int not null,
	id int not null,
	hinhAnh varchar not null,	
	moTa varchar(1000),
	soLuongNhap int not null,
	soLuongBan int not null
)

create table don_hang_san_pham (
  id int AUTO_INCREMENT primary key,
  don_hang_id int not null,
  san_pham_id int not null,
  soluong int not null
)
