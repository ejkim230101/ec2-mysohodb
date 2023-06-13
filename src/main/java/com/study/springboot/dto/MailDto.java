package com.study.springboot.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
public class MailDto {
    private String address;
    private String title;
    private String content;

    public  MailDto(){
        this.address = "mysoho2023@naver.com";
        this.title = "마이소호 샘플샵 비밀번호 변경 안내 이메일입니다";


    }

    public String getContent(String getEmail) {
        return content =
                " <div style=\"height:100%;background:#fff;color:#000;font-size:15px;line-height:1.5;letter-spacing:-0.5px\">" +
                        "<table style=\"text-align:left;table-layout:fixed;width:100%;border:0;border-spacing:0;border-collapse:collapse\">"+
                        "<tbody>"+
                        "<tr>"+
                        "<td>"+
                        "<div style=\"max-width:740px;border:1px solid #d7d7d7;letter-spacing:-1px\">"+
                        "<div style=\"border-bottom:1px solid #d7d7d7;background:#f6f6f6\">"+
                        "<h1 style=\"padding:20px 6%;margin:0\"><span style=\"display:block;font-size:20px;font-weight:normal;color:#000;word-break:break-word\">마이소호 샘플샵 비밀번호 변경 링크 안내 이메일입니다</span></h1>"+
                        "</div>"+
                        "<div style=\"padding:4% 6%\">"+
                        "<h2 style=\"font-size:32px;color:#00b0ff;word-break:break-word!important\">마이소호 샘플샵 비밀번호 변경 </h2>"+
                        "<div>"+
                        "<p style=\"margin-bottom:25px;font-size:17px;color:#454545;line-height:25px;word-break:break-word!important\">"+
                        "안녕하세요. 마이소호 샘플샵입니다.  <br>"+
                        "비밀번호 변경을 원하실 경우<br>"+
                        "하단 비밀번호 변경하기를 눌러주세요."+
                        "<br><br>"+
                        "<a href=\"http://localhost:8080/find/password2?getEmail="+getEmail+"\" rel=\"noopener\" style=\"display:inline-block;width:300px;height:50px;line-height:52px;background:#333;box-sizing:border-box;color:#fff;font-size:16px;font-weight:bold;text-align:center;text-decoration:none\" target=\"_blank\" >비밀번호 변경 하기</a>"+
                        "<br><br>"+
                        "</p>"+
                        "</div>"+
                        "</div>"+
                        "<div style=\"overflow:hidden;height:auto;padding:10px 0;border-top:1px solid #d7d7d7;background:#f6f6f6\">"+
                        "<div style=\"width:100%;margin-right:15px;font-size:13px;color:#000;line-height:26px;letter-spacing:0;padding:0 6%\">"+
                        "<p style=\"margin:0;padding:0\">서울 금천구 가산디지털1로 168  (가산동,우림라이온스밸리)A동 14층   |   사업자번호  2068121131</p>"+
                        "<p style=\"margin:0;padding:0\">02-6903-9118   |   <a href=\"mailto:help@mysoho.com\" style=\"color:#0000ff!important;text-decoration:none\" target=\"_blank\">help@mysoho.com</a></p>"+
                        "</div>"+
                        "</div>"+
                        "</div>"+
                        "</td>"+
                        "</tr>"+
                        "</tbody>"+
                        "</table><div class=\"yj6qo\"></div><div class=\"adL\">"+
                        "</div></div>";
    }
}
