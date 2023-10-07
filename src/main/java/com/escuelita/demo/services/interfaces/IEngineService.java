package com.escuelita.demo.services.interfaces;

import com.escuelita.demo.controllers.dtos.requests.CreateEngineRequest;
import com.escuelita.demo.controllers.dtos.requests.UpdateEngineRequest;
import com.escuelita.demo.controllers.dtos.responses.BaseResponse;
import com.escuelita.demo.controllers.dtos.responses.GetEngineResponse;
import com.escuelita.demo.entities.Engine;

import java.util.List;
import java.util.Optional;

public interface IEngineService {

    BaseResponse list();

    BaseResponse get(Long id);

    BaseResponse create(CreateEngineRequest request);

    GetEngineResponse update(Long id, UpdateEngineRequest request);

    void delete(Long id);

 Engine findById(Long engineId);

}