package com.exa.api.controller

import com.exa.api.entity.Category
import com.exa.api.service.CategoryService
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping('/categories')
class CategoryController {
  @Autowired
  private final CategoryService categoryService

  @GetMapping('')
  List<Category> findAll() {
    categoryService.findAll()
  }

  @GetMapping('{id}')
  Category findById(@PathVariable('id') int id) {
    categoryService.findById(id)
  }

  @PostMapping()
  Category save(@RequestBody Category categories) {
    categoryService.save(categories)
  }

  @PutMapping('{id}')
  Category update(@RequestBody Category categories, @PathVariable('id') int id) {
    categoryService.update(categories, id)
  }

  @DeleteMapping('{id}')
  Category delete(@PathVariable('id') int id) {
    categoryService.delete(id)
  }
}