package com.hb0730.boot.admin.project.monitor.operation.controller;


import com.hb0730.boot.admin.annotation.ClassDescribe;
import com.hb0730.boot.admin.annotation.PreAuth;
import com.hb0730.boot.admin.domain.controller.AbstractBaseController;
import com.hb0730.boot.admin.project.monitor.operation.model.dto.OperLogDTO;
import com.hb0730.boot.admin.project.monitor.operation.model.entity.OperLogEntity;
import com.hb0730.boot.admin.project.monitor.operation.model.query.OperLogParams;
import com.hb0730.boot.admin.project.monitor.operation.service.IOperLogService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 操作日志  前端控制器
 *
 * @author bing_huang
 * @since 3.0.0
 */
@RestController
@RequestMapping("/api/v3/monitor/operation/log")
@ClassDescribe("操作日志")
@PreAuth("oper:log")
public class OperLogController extends AbstractBaseController<Long, OperLogDTO, OperLogParams, OperLogEntity> {
    private final IOperLogService service;

    public OperLogController(IOperLogService service) {
        super(service);
        this.service = service;
    }
}

