package tech.ufun.framework.core.page;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import tech.ufun.framework.constant.Constants;
import tech.ufun.framework.util.ServletUtils;
import tech.ufun.framework.util.SqlUtil;
import tech.ufun.framework.util.StringUtils;

import java.util.List;

/**
 * 分页支持
 *
 * @author zhanglei
 * @date 2020-09-01 17:19
 */
public class PageSupport {

    public static PageData getPageData(List<?> list) {
        PageData pageData = new PageData();
        pageData.setCode(0);
        pageData.setRows(list);
        pageData.setTotal(new PageInfo(list).getTotal());
        return pageData;
    }

    public static void startPage() {
        PageDomain pageDomain = PageSupport.buildPageRequest();
        Integer pageNum = pageDomain.getPageNum();
        Integer pageSize = pageDomain.getPageSize();
        if (StringUtils.isNotNull(pageNum) && StringUtils.isNotNull(pageSize)) {
            String orderBy = SqlUtil.escapeOrderBySql(pageDomain.getOrderBy());
            PageHelper.startPage(pageNum, pageSize, orderBy);
        }
    }

    /**
     * 封装分页对象
     */
    public static PageDomain getPageDomain() {
        PageDomain pageDomain = new PageDomain();
        pageDomain.setPageNum(ServletUtils.getParameterToInt(Constants.PAGE_NUM));
        pageDomain.setPageSize(ServletUtils.getParameterToInt(Constants.PAGE_SIZE));
        pageDomain.setOrderByColumn(ServletUtils.getParameter(Constants.ORDER_BY_COLUMN));
        pageDomain.setIsAsc(ServletUtils.getParameter(Constants.IS_ASC));
        return pageDomain;
    }

    public static PageDomain buildPageRequest() {
        return getPageDomain();
    }
}
