import React, { useContext, useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import { CartContext } from './CartContext';

function ProductDetail() {
  const { id } = useParams();
  const [product, setProduct] = useState({});
  const { addToCart } = useContext(CartContext);

  useEffect(() => {
    fetch(`https://fakestoreapi.com/products/${id}`)
      .then((res) => res.json())
      .then(setProduct);
  }, [id]);

  return (
    <div>
      <div className="col-6 col-md-3">
        <img src={product.image} alt={product.title} className="img-fluid square-image" />
      </div>

      <div className="col-6 col-md-4">
        <h3>{product.title}</h3>
        <p>{product.description}</p>
      </div>
      
      <button onClick={() => addToCart(product)} className="btn btn-primary">Add to Cart</button>
    </div>

    
  );
}

export default ProductDetail;
