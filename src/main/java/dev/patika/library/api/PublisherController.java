package dev.patika.library.api;

import dev.patika.library.business.abstracts.PublisherService;
import dev.patika.library.core.config.modelMapper.ModelMapperService;
import dev.patika.library.core.result.Result;
import dev.patika.library.core.result.ResultData;
import dev.patika.library.core.utilities.ResultHelper;
import dev.patika.library.dto.request.publisher.PublisherSaveRequest;
import dev.patika.library.dto.response.publisher.PublisherResponse;
import dev.patika.library.entities.Publisher;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/publishers")
public class PublisherController {
    private  final PublisherService publisherService;
    private  final ModelMapperService modelMapperService;

    public PublisherController(PublisherService publisherService, ModelMapperService modelMapperService) {
        this.publisherService = publisherService;
        this.modelMapperService = modelMapperService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResultData<PublisherResponse> save (@Valid @RequestBody PublisherSaveRequest publisherSaveRequest){
        Publisher savePublisher= this.modelMapperService.forRequest().map(publisherSaveRequest,Publisher.class);
        this.publisherService.save(savePublisher);
        return ResultHelper.created(this.modelMapperService.forResponse().map(savePublisher,PublisherResponse.class));
    }
}
