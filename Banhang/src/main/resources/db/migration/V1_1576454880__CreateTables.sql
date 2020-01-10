create table TaiKhoan
(
	id_TaiKhoan int AUTO_INCREMENT primary key,
	tenTaiKhoan nnvarchar(100),
	matKhau nvarchar(20) not null,
	hoTen nvarchar(100) not null,
	gioitinh boolean not null,
	soDienThoai nvarchar(11)not null,
	email nvarchar(100),
	quyen nvarchar(10) not null
)

create table NhaCungCap
(
	id_NCC int AUTO_INCREMENT primary key,
	tenNhaCungCap nvarchar(100) not null,
	diaChi nvarchar(100) not null,
	soDienThoai nvarchar(11)not null
)

create table Loai(
	id int AUTO_INCREMENT primary key,
	tenLoai nvarchar(100) not null,
	moTa nvarchar(1000) not null
)


create table SanPham
(
	id_SanPham int AUTO_INCREMENT primary key,
	tenSanPham nvarchar(100) not null,
	giaDaGiam float not null,
	giaBan float not null,
	id_NCC int not null,
	id int not null,
	hinhAnh nvarchar not null,	
	moTa nvarchar(1000),
	soLuongNhap int not null,
	soLuongBan int not null
	constraint id_NCC_FK foreign key(id_NCC) references NhaCungCap(id_NCC),
	constraint id_FK foreign key(id) references Loai(id)
)

create table DonHang
(
	id_DonHang int AUTO_INCREMENT primary key,
	id_TaiKhoan int not null,
	tongSoLuong int not null,
	id_SanPham int not null,
	tongTien float not null,
	ngayMua date not null,
	tinhTrangDH nvarchar(100) not null
	constraint id_TaiKhoan_FK foreign key(id_TaiKhoan) references TaiKhoan(id_TaiKhoan),
	constraint id_SanPham_FK foreign key(id_SanPham) references Sanpham(id_SanPham)

)