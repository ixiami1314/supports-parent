package com.jc.support.mapper;

import com.jc.support.model.ExUserVO;
import com.jc.support.supports.dal.dataobject.ExUserDO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;

import java.util.Collection;

/**
 * supports-parent
 *
 * Created by weijun on 2018/2/27
 *
 */
@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT) public interface ExUserMapper extends AbstractMapper {
    ExUserVO do2vo(ExUserDO dataObject);

    ExUserDO vo2do(ExUserVO dateVO);

    Collection<ExUserVO> do2vos(Collection<ExUserDO> dataObjects);

    Collection<ExUserDO> vo2dos(Collection<ExUserVO> dateVOs);
}
