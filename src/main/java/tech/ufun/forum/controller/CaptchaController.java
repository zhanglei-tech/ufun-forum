package tech.ufun.forum.controller;

import com.wf.captcha.ArithmeticCaptcha;
import com.wf.captcha.ChineseCaptcha;
import com.wf.captcha.GifCaptcha;
import com.wf.captcha.utils.CaptchaUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 图片验证码（支持算术形式）
 *
 * @author prometheus
 */
@Controller
@RequestMapping("/captcha")
public class CaptchaController {

    @GetMapping("/image")
    public void getCaptcha(HttpServletRequest request, HttpServletResponse response) {
        try {
            String type = request.getParameter("type");
            if ("math".equals(type)) {
                ArithmeticCaptcha captcha = new ArithmeticCaptcha();
                captcha.setLen(2);
                CaptchaUtil.out(captcha, request, response);
            } else if ("gif".equals(type)) {
                GifCaptcha captcha = new GifCaptcha();
                CaptchaUtil.out(captcha, request, response);
            } else if ("cn".equals(type)) {
                ChineseCaptcha captcha = new ChineseCaptcha ();
                CaptchaUtil.out(captcha, request, response);
            } else {
                CaptchaUtil.out(request, response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}