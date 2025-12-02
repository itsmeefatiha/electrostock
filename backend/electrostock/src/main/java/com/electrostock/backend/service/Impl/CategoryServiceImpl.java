package com.electrostock.backend.service.Impl;

import com.electrostock.backend.entity.Category;
import com.electrostock.backend.repository.CategoryRepository;
import com.electrostock.backend.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Long id, Category category){
        Category existing = getCategoryById(id);
        existing.setName(category.getName());
        return categoryRepository.save(existing);


    @Override
    public void deleteCategory(Long id){
        categoryRepository.deleteById(id);
    }

    @Override
    public Category getCategoryById(Long id){
        return categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));
    }

    @Override
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }
}
