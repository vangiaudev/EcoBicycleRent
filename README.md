# EcoBicycleRent
**Dự án phát triển hệ thống cho thuê xe đạp Eco Bicycle for Rent
**Ứng dụng được xây dựng bằng ngôn ngữ Java và chạy trên các thiết bị sử dụng hệ điều hành Android
**Ứng dụng bao gồm các chức năng chính như Đăng ký mua thẻ, Thuê xe, Nạp tiền vào thẻ, Tìm kiếm chọn xe và một số chức năng khác như Hoàn trả thẻ, Trả xe.

##1.	Giao diện sẽ xuất hiện như hình bên dưới sau khi mở ứng dụng
![dashboard](https://user-images.githubusercontent.com/75024999/143438217-d454037f-24b6-45e8-a3ad-f09056057fea.png)

 
##2.	Nếu người dùng lần đầu tiên sử dụng dịch vụ thì ta tiến hành đăng ký mua thẻ
Ở màn hình đăng ký này, hệ thống sẽ hiển thị 2 cách để mua thẻ và người dùng tiến hành chọn 1 trong 2 cách trên và nhấn nút “XÁC NHẬN CHỌN THẺ”
![SignUp](https://user-images.githubusercontent.com/75024999/143438321-9a0615e5-824e-4ea7-8920-c82601adbd9f.png)

 
##3.	 Sau khi chọn loại thẻ đăng ký, nếu là thẻ trả trước thì người dùng sẽ nhập các thông tin các nhân và số tiền nạp vào thẻ, sau đó người dùng đưa tiền nạp vào máy và nhấn “ĐĂNG KÝ MUA THẺ”. Hệ thống sẽ tiến hành kiểm tra số tiền khách hàng nạp vào có >= 1.000.000đ hay không, nếu thỏa điều kiện thì hệ thống sẽ thông báo thành công và xuất trình thẻ mượn cho khách hàng như hình bên dưới
![SignUpPart2](https://user-images.githubusercontent.com/75024999/143438402-2d2a6db8-6389-403e-b1e8-2b054d231d0e.png)
![SignUpSuccess](https://user-images.githubusercontent.com/75024999/143438469-b14cb93f-bdb3-464a-a6bd-30a470aec22e.png)

##4.	Trường hợp nếu là thẻ trả sau thì khách hàng cần liên kết với thẻ thanh toán ngân hàng. Người dùng đưa thẻ ngân hàng vào máy và tiến hành nhập mã PIN sau đó hệ thống sẽ tiến hành quét thẻ và lưu lại các thông tin trên thẻ 
![Paypal](https://user-images.githubusercontent.com/75024999/143438604-020b32b2-9bf2-480b-a87e-8776754d488f.png)

 
##5.	Sau khi đã có thẻ mượn, người dùng tiến hành chọn chức năng thuê xe bằng cách nhấn “THUÊ XE” trên giao diện màn hình trang chủ. Hệ thống sẽ hiển thị danh sách tất cả các xe đạp và người dùng có thể thực hiện chức năng tìm kiếm xe đạp mình muốn mượn bằng cách nhập tên xe trên thanh tìm kiếm.
![Search](https://user-images.githubusercontent.com/75024999/143438674-81453854-10d9-4069-bb38-41761edd1eab.png)

##6.	Người dùng nhấp vào dòng xe muốn thuê để xem các thông tin chi tiết về xe sau đó chọn phương thức thanh toán và nhấn “XÁC NHẬN THUÊ XE” và đưa thẻ mượn vào máy hệ thống sẽ tiến hành quét thẻ. 
![RentDetails](https://user-images.githubusercontent.com/75024999/143438754-87780770-8a23-4f45-a95c-699e81fdb8c2.png)

 
##7.	Sau khi hệ thống kiểm tra thẻ hợp lệ thì sẽ thông báo ra màn hình và mở khóa xe đạp. Người dùng dắt xe đạp ra và sử dụng 
![Finished](https://user-images.githubusercontent.com/75024999/143438836-aaee80ad-2f64-447f-9ab1-7d7c1031c44a.png)
