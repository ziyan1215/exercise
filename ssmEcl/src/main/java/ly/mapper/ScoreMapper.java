package ly.mapper;

import ly.entity.Score;
import ly.entity.ScoreKey;

public interface ScoreMapper {
    int deleteByPrimaryKey(ScoreKey key);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(ScoreKey key);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}