
drop table don_hang_san_pham;
create table don_hang_san_pham (
  id int AUTO_INCREMENT primary key,
  don_hang_id int not null,
  san_pham_id int not null,
  soluong int not null
)
