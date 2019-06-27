------------------------------Show Alert-----------------------------
btnClick{
  let alert: UIAlertController = UIAlertController(title: "Thong bao", message: "Ahihi",prefferedStyle: .alert)
  let btnOk: UIAlertAction = UIAlertAction(title: "OK", style: .default, handler: nil)
  alert.addAction(btnOk)
  
  //muốn thêm textfield vào thì
  alert.addTextField(closure) mở closure đặt tên biết closure để chỉnh các thuộc tính cho textFields đó
  
  //muốn lấy giá trị của các textField trong alert thì
  let textFields1Text = alert.textFields[x].text!
  
  present(alert,animated: true,completion: nil)
}



------------------------------Action Sheet -----------------------------
  let alert: UIAlertController = UIAlertController(title: "Thong bao", message: "Ahihi",prefferedStyle: .actionSheet)
  let btnOk: UIAlertAction = UIAlertAction(title: "OK", style: .default, handler: nil)
  alert.addAction(btnOk)
  
  //muốn thêm textfield vào thì
  alert.addTextField(closure) mở closure đặt tên biết closure để chỉnh các thuộc tính cho textFields đó
  
  //muốn lấy giá trị của các textField trong alert thì
  let textFields1Text = alert.textFields[x].text!
  
  present(alert,animated: true,completion: nil)
  
  
  ----------------------------- Timer --------------------------------------
  Timer.scheduledTimer(withTimeInterval: 1, repeats: true) { (time) in
       print("Hello")
  }
        
 ###Timer gọi thực thi 1 hàm khác: target sẽ là tên class ViewController, selector:#selector(ViewController.Run111) là chạy hàm nào trong ViewController###
 
    let timer = Timer.scheduledTimer(timeInterval: 1, target: self, selector:#selector(ViewController.Run111), userInfo: nil,     repeats:  true)

    @objc func Run111() {
        print("Run....")
    }
    
###Huỷ timer###
    timer.invalidate()
    timer=nil
    
    
--------------------------------------Chuyển Activity bằng Code ------------------------------------------
###MH2 là id của ViewController đặt bằng cách qua storyboard chọn vào màn hình bấm vào tab thứ 3 đặt StoryBoard ID###

@IBAction func onClicked(_ sender: Any) {
        print("activity 1 on clicked")
        let activity2 = storyboard?.instantiateViewController(withIdentifier: "MH2") as! Activity2ViewController
        present(activity2, animated: true, completion: nil)
    }
 
    
