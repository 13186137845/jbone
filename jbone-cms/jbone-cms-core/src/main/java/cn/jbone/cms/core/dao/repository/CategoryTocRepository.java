package cn.jbone.cms.core.dao.repository;

import cn.jbone.cms.core.dao.entity.Category;
import cn.jbone.cms.core.dao.entity.CategoryToc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryTocRepository extends JpaRepository<CategoryToc,Long>, JpaSpecificationExecutor<CategoryToc> {
    long countByPid(long pid);

    CategoryToc findCategoryTocByCategory(Category category);
}
