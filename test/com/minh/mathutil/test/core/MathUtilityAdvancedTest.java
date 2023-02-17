/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minh.mathutil.test.core;

import com.minh.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author ROG
 */

@RunWith(value = Parameterized.class)
//báo với JUnit và JVM rằng, class này sẽ tách data ra khỏi
//câu lệnh assertEquals()
//Về logic, khi run class này, JUnit sẽ tự sinh ra thêm
//code để fill data vào trong hàm assertEquals() cho mình
//Mình bị phải viết code theo cách JUnit yêu cầu
//thì mới sửa đc bad smell
//Dùng code theo cách thức bị ép tuân thủ 1 logic nào đó
//=> TA ĐANG DÙNG FRAMEWORK
public class MathUtilityAdvancedTest {
    
    //Chuẩn bị data - mảng 2 chiều
    @Parameterized.Parameters
    public static Object[][] initData(){
        //Mảng 1 chiều
        int a[] = {5, 10, 15, 20};
        
        //Mảng 2 chiều
        //Hàm có data là phải có return
        //Ở dưới là tạo mảng có sẵn return
        return new Object[][]{
                            {0, 1},
                            {1, 1},
                            {2, 2},
                            {3, 6},
                            {4, 24},
                            {5, 120},
                          };
    }
    
    //Map 1 dòng gồm 2 cột vào 2 biến n và expected
    //JUnit sẽ tự loop qua từng dòng của mảng để gán
    //data các cột vào 2 biến tương ứng!!!
    @Parameterized.Parameter(value = 0)
    public int n;
    
    @Parameterized.Parameter(value = 1)
    public long expected;
    
    //Test, so sánh  
    @Test
    public void testFactorialGivenRightArugmentRunsWell(){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
