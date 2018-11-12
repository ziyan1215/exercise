package ly.mapper;

import ly.entity.Course;

public interface CourseMapper {
    int deleteByPrimaryKey(String cId);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(String cId);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}