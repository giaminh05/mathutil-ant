/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minh.mathutil.test.core;

import com.minh.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author ROG
 */
public class MathUtilityTest {
    
    //hàm getF() còn đc thiết kế rằng: nếu đưa n cà chớn
    //tham số k đúng chuẩn, n<0 | n>20 thì
    //HÀM ĐC THIẾT KẾ LÀ NÉM RA NGOẠI LỆ
    //TỨC LÀ: NẾU ĐƯA N<0, VÍ DỤ N=-5 THÌ SẼ NHẬN VỀ
    //EXPECTED LÀ EXCEPTION
    //TA SẼ DÙNG JUNIT ĐỂ TEST XEM HÀM CÓ NÉM RA NGOẠI LỆ
    //NHƯ THIẾT KẾ HAY K
    
    @Test 
        //biến hàm ở dưới này thành public static void main()
    //hình thức của Framework, dàn khung viết code
    //viết code phải theo định dạng yêu cầu trước
    public void testRedGreenSignal(){
        Assert.assertEquals(6789, 6789);
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        //Case 1: Test getF() with n = 0
        //Expected: 1
        //test thử hàm getF() với n = 0 hy vọng trả về 1 tức là 0!
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);
        
        //Case 2: Test getF() with n = 1
        //expected: 1
        //test hàm getF() với n = 1 hy vọng trả về 1 tức là 1!
        Assert.assertEquals(1, MathUtility.getFactorial(1));
        
        //Case 3: Test getF() with n = 6
        //expected: 720
        //test hàm getF() với n = 6 hy vọng trả về 720 tức là 6!
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        
        Assert.assertEquals(120, MathUtility.getFactorial(5));
        
        //VIẾT KIỂU ASSERTEQUALS(EXPECTED, ACTUAL)
        //LẶP ĐI LẶP LẠI -> CODE BỐC MÙI - BAD SMELL
        //NHƯỢC ĐIỂM ĐOẠN CODE TRÊN:
        //Trộn lẫn giữa lệnh so sánh và các data dùng để test
        //Vì trộn lẫn nên ta khó nhìn hết đầy đủ các test case
        //Nghịch lý thuốc trừ sâu có khả năng xuất hiện
        //TA SẼ FIX CODE BỐC MÙI LẶP LẠI BẰNG 1 KĨ THUẬT MỚI
        //DDT - DATA DRIVEN TESTING
        
    }
    
    @Test(expected = Exception.class) 
    public void testFactorialGivenWrongArgumentThrowsException(){
        //nguyên tắc kiểm thử: so sánh giữa expected vs. actual
        //Case 4: test getF() with n<0
        //Expected: an Exception is thrown. In this case Illegal Argument Exception is thrown
        //JUnit 4 k có hàm assert() Exception
        //JUnit 5 thì có
        MathUtility.getFactorial(-5);
        //Nếu chỉ viết lệnh này đứng 1 mình thì 
        //có nghĩa là ta chưa so sánh liệu rằng có 
        //ngoại lệ như kì vọng hay k
        //xanh đỏ trong tình huống này nó k phản ánh ý nghĩa đúng
        //vậy ta phải bắt/đo xem ngoại lệ đã có chưa
        //nếu có thì XANH
        //nếu chưa có thì ĐỎ
    }
}
